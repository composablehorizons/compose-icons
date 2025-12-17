package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Transit_enterexit: ImageVector
    get() {
        if (_Transit_enterexit != null) return _Transit_enterexit!!
        
        _Transit_enterexit = ImageVector.Builder(
            name = "transit_enterexit",
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
                moveTo(14.5f, 18f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(9.5f)
                curveTo(6f, 8.67f, 6.67f, 8f, 7.5f, 8f)
                reflectiveCurveTo(9f, 8.67f, 9f, 9.5f)
                verticalLineToRelative(3.27f)
                lineTo(14.95f, 7f)
                curveToRelative(0.57f, -0.55f, 1.48f, -0.54f, 2.04f, 0.02f)
                reflectiveCurveToRelative(0.56f, 1.47f, 0.01f, 2.04f)
                lineTo(11.15f, 15f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.build()
        
        return _Transit_enterexit!!
    }

private var _Transit_enterexit: ImageVector? = null

