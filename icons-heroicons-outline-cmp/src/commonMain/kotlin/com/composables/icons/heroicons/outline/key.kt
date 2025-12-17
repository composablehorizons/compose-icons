package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15.75f, 5.25f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                moveToRelative(3f, 0f)
                arcToRelative(6f, 6f, 0f, false, true, -7.029f, 5.912f)
                curveToRelative(-0.563f, -0.097f, -1.159f, 0.026f, -1.563f, 0.43f)
                lineTo(10.5f, 17.25f)
                horizontalLineTo(8.25f)
                verticalLineToRelative(2.25f)
                horizontalLineTo(6f)
                verticalLineToRelative(2.25f)
                horizontalLineTo(2.25f)
                verticalLineToRelative(-2.818f)
                curveToRelative(0f, -0.597f, 0.237f, -1.17f, 0.659f, -1.591f)
                lineToRelative(6.499f, -6.499f)
                curveToRelative(0.404f, -0.404f, 0.527f, -1f, 0.43f, -1.563f)
                arcTo(6f, 6f, 0f, true, true, 21.75f, 8.25f)
                close()
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

