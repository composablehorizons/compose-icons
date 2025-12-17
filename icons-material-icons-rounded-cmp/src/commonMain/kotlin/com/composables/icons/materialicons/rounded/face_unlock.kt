package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Face_unlock: ImageVector
    get() {
        if (_Face_unlock != null) return _Face_unlock!!
        
        _Face_unlock = ImageVector.Builder(
            name = "face_unlock",
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
                moveTo(10.25f, 13f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                reflectiveCurveTo(7.75f, 13.69f, 7.75f, 13f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                close()
                moveTo(15f, 11.75f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
                reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
                reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
                close()
                moveToRelative(7f, 0.25f)
                curveToRelative(0f, 5.52f, -4.48f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.52f, 2f, 12f)
                reflectiveCurveTo(6.48f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.48f, 10f, 10f)
                close()
                moveTo(10.66f, 4.12f)
                curveTo(12.06f, 6.44f, 14.6f, 8f, 17.5f, 8f)
                curveToRelative(0.46f, 0f, 0.91f, -0.05f, 1.34f, -0.12f)
                curveTo(17.44f, 5.56f, 14.9f, 4f, 12f, 4f)
                curveToRelative(-0.46f, 0f, -0.91f, 0.05f, -1.34f, 0.12f)
                close()
                moveTo(4.42f, 9.47f)
                curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f)
                curveTo(6.37f, 6f, 5.05f, 7.58f, 4.42f, 9.47f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -0.78f, -0.12f, -1.53f, -0.33f, -2.24f)
                curveToRelative(-0.7f, 0.15f, -1.42f, 0.24f, -2.17f, 0.24f)
                curveToRelative(-3.13f, 0f, -5.92f, -1.44f, -7.76f, -3.69f)
                curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4f, 11.86f)
                curveToRelative(0.01f, 0.04f, 0f, 0.09f, 0f, 0.14f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                close()
            }
        }.build()
        
        return _Face_unlock!!
    }

private var _Face_unlock: ImageVector? = null

