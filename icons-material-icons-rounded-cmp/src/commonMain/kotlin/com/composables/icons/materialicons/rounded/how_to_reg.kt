package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.How_to_reg: ImageVector
    get() {
        if (_How_to_reg != null) return _How_to_reg!!
        
        _How_to_reg = ImageVector.Builder(
            name = "how_to_reg",
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
                moveTo(12f, 20f)
                lineToRelative(-0.86f, -0.86f)
                curveToRelative(-1.18f, -1.18f, -1.17f, -3.1f, 0.02f, -4.26f)
                lineToRelative(0.84f, -0.82f)
                curveToRelative(-0.39f, -0.04f, -0.68f, -0.06f, -1f, -0.06f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                close()
                moveToRelative(-1f, -8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.18f, 19.78f)
                curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.42f, 0f)
                lineToRelative(-2.07f, -2.09f)
                curveToRelative(-0.38f, -0.39f, -0.38f, -1.01f, 0f, -1.39f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.4f, 0f)
                lineToRelative(1.37f, 1.37f)
                lineToRelative(4.43f, -4.46f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.38f, 0.39f, 0.38f, 1.01f, 0f, 1.39f)
                lineToRelative(-5.14f, 5.18f)
                close()
            }
        }.build()
        
        return _How_to_reg!!
    }

private var _How_to_reg: ImageVector? = null

