package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.EyeDropper: ImageVector
    get() {
        if (_EyeDropper != null) return _EyeDropper!!
        
        _EyeDropper = ImageVector.Builder(
            name = "eye-dropper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15f, 11.25f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(0.75f, -0.75f)
                verticalLineTo(8.758f)
                lineToRelative(2.276f, -0.61f)
                arcToRelative(3f, 3f, 0f, true, false, -3.675f, -3.675f)
                lineToRelative(-0.61f, 2.277f)
                horizontalLineTo(12f)
                lineToRelative(-0.75f, 0.75f)
                lineToRelative(1.5f, 1.5f)
                moveTo(15f, 11.25f)
                lineToRelative(-8.47f, 8.47f)
                curveToRelative(-0.34f, 0.34f, -0.8f, 0.53f, -1.28f, 0.53f)
                reflectiveCurveToRelative(-0.94f, 0.19f, -1.28f, 0.53f)
                lineToRelative(-0.97f, 0.97f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(0.97f, -0.97f)
                curveToRelative(0.34f, -0.34f, 0.53f, -0.8f, 0.53f, -1.28f)
                reflectiveCurveToRelative(0.19f, -0.94f, 0.53f, -1.28f)
                lineTo(12.75f, 9f)
                moveTo(15f, 11.25f)
                lineTo(12.75f, 9f)
            }
        }.build()
        
        return _EyeDropper!!
    }

private var _EyeDropper: ImageVector? = null

