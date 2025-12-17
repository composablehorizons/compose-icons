package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Supervised_user_circle: ImageVector
    get() {
        if (_Supervised_user_circle != null) return _Supervised_user_circle!!
        
        _Supervised_user_circle = ImageVector.Builder(
            name = "supervised_user_circle",
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
                moveTo(11.99f, 2f)
                curveToRelative(-5.52f, 0f, -10f, 4.48f, -10f, 10f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                reflectiveCurveToRelative(-4.48f, -10f, -10f, -10f)
                close()
                moveToRelative(3.61f, 6.34f)
                curveToRelative(1.07f, 0f, 1.93f, 0.86f, 1.93f, 1.93f)
                curveToRelative(0f, 1.07f, -0.86f, 1.93f, -1.93f, 1.93f)
                curveToRelative(-1.07f, 0f, -1.93f, -0.86f, -1.93f, -1.93f)
                curveToRelative(-0.01f, -1.07f, 0.86f, -1.93f, 1.93f, -1.93f)
                close()
                moveToRelative(-6f, -1.58f)
                curveToRelative(1.3f, 0f, 2.36f, 1.06f, 2.36f, 2.36f)
                curveToRelative(0f, 1.3f, -1.06f, 2.36f, -2.36f, 2.36f)
                reflectiveCurveToRelative(-2.36f, -1.06f, -2.36f, -2.36f)
                curveToRelative(0f, -1.31f, 1.05f, -2.36f, 2.36f, -2.36f)
                close()
                moveToRelative(0f, 9.13f)
                verticalLineToRelative(3.75f)
                curveToRelative(-2.4f, -0.75f, -4.3f, -2.6f, -5.14f, -4.96f)
                curveToRelative(1.05f, -1.12f, 3.67f, -1.69f, 5.14f, -1.69f)
                curveToRelative(0.53f, 0f, 1.2f, 0.08f, 1.9f, 0.22f)
                curveToRelative(-1.64f, 0.87f, -1.9f, 2.02f, -1.9f, 2.68f)
                close()
                moveTo(11.99f, 20f)
                curveToRelative(-0.27f, 0f, -0.53f, -0.01f, -0.79f, -0.04f)
                verticalLineToRelative(-4.07f)
                curveToRelative(0f, -1.42f, 2.94f, -2.13f, 4.4f, -2.13f)
                curveToRelative(1.07f, 0f, 2.92f, 0.39f, 3.84f, 1.15f)
                curveToRelative(-1.17f, 2.97f, -4.06f, 5.09f, -7.45f, 5.09f)
                close()
            }
        }.build()
        
        return _Supervised_user_circle!!
    }

private var _Supervised_user_circle: ImageVector? = null

