package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Face: ImageVector
    get() {
        if (_Face != null) return _Face!!
        
        _Face = ImageVector.Builder(
            name = "face",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 11.75f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveToRelative(6f, 0f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(17.52f, 2f, 12f, 2f)
                close()
                moveToRelative(0f, 18f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                curveToRelative(0f, -0.29f, 0.02f, -0.58f, 0.05f, -0.86f)
                curveToRelative(2.36f, -1.05f, 4.23f, -2.98f, 5.21f, -5.37f)
                curveTo(11.07f, 8.33f, 14.05f, 10f, 17.42f, 10f)
                curveToRelative(0.78f, 0f, 1.53f, -0.09f, 2.25f, -0.26f)
                curveToRelative(0.21f, 0.71f, 0.33f, 1.47f, 0.33f, 2.26f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                close()
            }
        }.build()
        
        return _Face!!
    }

private var _Face: ImageVector? = null

