package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Not_listed_location: ImageVector
    get() {
        if (_Not_listed_location != null) return _Not_listed_location!!
        
        _Not_listed_location = ImageVector.Builder(
            name = "not_listed_location",
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
                moveTo(12.01f, 16f)
                arcToRelative(0.99f, 0.99f, 0f, false, false, 1f, -1f)
                arcToRelative(0.99f, 0.99f, 0f, false, false, -1f, -1f)
                curveToRelative(-0.28f, 0f, -0.51f, 0.1f, -0.71f, 0.29f)
                curveToRelative(-0.2f, 0.19f, -0.3f, 0.43f, -0.3f, 0.7f)
                reflectiveCurveToRelative(0.1f, 0.51f, 0.29f, 0.71f)
                curveToRelative(0.2f, 0.2f, 0.44f, 0.3f, 0.72f, 0.3f)
                close()
                moveToRelative(-0.88f, -3.66f)
                verticalLineTo(13f)
                horizontalLineToRelative(1.85f)
                verticalLineToRelative(-0.42f)
                curveToRelative(0f, -0.33f, 0.06f, -0.6f, 0.18f, -0.81f)
                curveToRelative(0.12f, -0.21f, 0.33f, -0.47f, 0.65f, -0.77f)
                curveToRelative(0.4f, -0.38f, 0.68f, -0.75f, 0.89f, -1.09f)
                curveToRelative(0.19f, -0.35f, 0.3f, -0.76f, 0.3f, -1.25f)
                reflectiveCurveToRelative(-0.13f, -0.94f, -0.39f, -1.35f)
                arcToRelative(2.57f, 2.57f, 0f, false, false, -1.05f, -0.96f)
                curveTo(13.11f, 6.12f, 12.58f, 6f, 12f, 6f)
                curveToRelative(-0.78f, 0f, -1.51f, 0.32f, -2.03f, 0.79f)
                curveTo(9.46f, 7.27f, 9f, 7.99f, 9f, 9f)
                horizontalLineToRelative(1.68f)
                curveToRelative(0f, -0.52f, 0.19f, -0.77f, 0.4f, -0.98f)
                curveToRelative(0.21f, -0.2f, 0.58f, -0.3f, 0.96f, -0.3f)
                curveToRelative(0.35f, 0f, 0.64f, 0.1f, 0.85f, 0.3f)
                curveToRelative(0.21f, 0.2f, 0.32f, 0.45f, 0.32f, 0.74f)
                curveToRelative(0f, 0.24f, -0.06f, 0.46f, -0.19f, 0.64f)
                curveToRelative(-0.13f, 0.19f, -0.33f, 0.41f, -0.61f, 0.66f)
                curveToRelative(-0.48f, 0.42f, -0.81f, 0.79f, -1f, 1.12f)
                curveToRelative(-0.19f, 0.33f, -0.28f, 0.71f, -0.28f, 1.16f)
                close()
                moveTo(12f, 2f)
                curveToRelative(4.2f, 0f, 8f, 3.22f, 8f, 8.2f)
                curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveTo(4f, 5.22f, 7.8f, 2f, 12f, 2f)
                close()
            }
        }.build()
        
        return _Not_listed_location!!
    }

private var _Not_listed_location: ImageVector? = null

