package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Vignette: ImageVector
    get() {
        if (_Vignette != null) return _Vignette!!
        
        _Vignette = ImageVector.Builder(
            name = "vignette",
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
                moveTo(21f, 5f)
                verticalLineToRelative(14f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                moveToRelative(0f, -2f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-9f, 5f)
                curveToRelative(3.25f, 0f, 6f, 1.83f, 6f, 4f)
                reflectiveCurveToRelative(-2.75f, 4f, -6f, 4f)
                reflectiveCurveToRelative(-6f, -1.83f, -6f, -4f)
                reflectiveCurveToRelative(2.75f, -4f, 6f, -4f)
                moveToRelative(0f, -2f)
                curveToRelative(-4.42f, 0f, -8f, 2.69f, -8f, 6f)
                reflectiveCurveToRelative(3.58f, 6f, 8f, 6f)
                reflectiveCurveToRelative(8f, -2.69f, 8f, -6f)
                reflectiveCurveToRelative(-3.58f, -6f, -8f, -6f)
                close()
            }
        }.build()
        
        return _Vignette!!
    }

private var _Vignette: ImageVector? = null

