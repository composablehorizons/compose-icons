package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Gavel: ImageVector
    get() {
        if (_Gavel != null) return _Gavel!!
        
        _Gavel = ImageVector.Builder(
            name = "gavel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 21f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(5.24f, 8.07f)
                lineToRelative(2.83f, -2.83f)
                lineTo(20.8f, 17.97f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                lineTo(5.24f, 8.07f)
                close()
                moveToRelative(8.49f, -5.66f)
                lineToRelative(2.83f, 2.83f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(-5.65f, -5.66f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.78f, -0.79f, 2.05f, -0.79f, 2.83f, -0.01f)
                close()
                moveToRelative(-9.9f, 7.07f)
                lineToRelative(5.66f, 5.66f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Gavel!!
    }

private var _Gavel: ImageVector? = null

