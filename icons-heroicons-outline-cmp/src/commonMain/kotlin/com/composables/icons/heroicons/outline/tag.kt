package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
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
                moveTo(9.568f, 3f)
                horizontalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3f, 5.25f)
                verticalLineToRelative(4.318f)
                curveToRelative(0f, 0.597f, 0.237f, 1.17f, 0.659f, 1.591f)
                lineToRelative(9.581f, 9.581f)
                curveToRelative(0.699f, 0.699f, 1.78f, 0.872f, 2.607f, 0.33f)
                arcToRelative(18.095f, 18.095f, 0f, false, false, 5.223f, -5.223f)
                curveToRelative(0.542f, -0.827f, 0.369f, -1.908f, -0.33f, -2.607f)
                lineTo(11.16f, 3.66f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9.568f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(6f, 6f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

