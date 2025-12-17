package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.InstagramSquare: ImageVector
    get() {
        if (_InstagramSquare != null) return _InstagramSquare!!
        
        _InstagramSquare = ImageVector.Builder(
            name = "instagram-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 202.66f)
                arcTo(53.34f, 53.34f, 0f, true, false, 277.36f, 256f)
                arcTo(53.38f, 53.38f, 0f, false, false, 224f, 202.66f)
                close()
                moveToRelative(124.71f, -41f)
                arcToRelative(54f, 54f, 0f, false, false, -30.41f, -30.41f)
                curveToRelative(-21f, -8.29f, -71f, -6.43f, -94.3f, -6.43f)
                reflectiveCurveToRelative(-73.25f, -1.93f, -94.31f, 6.43f)
                arcToRelative(54f, 54f, 0f, false, false, -30.41f, 30.41f)
                curveToRelative(-8.28f, 21f, -6.43f, 71.05f, -6.43f, 94.33f)
                reflectiveCurveTo(91f, 329.26f, 99.32f, 350.33f)
                arcToRelative(54f, 54f, 0f, false, false, 30.41f, 30.41f)
                curveToRelative(21f, 8.29f, 71f, 6.43f, 94.31f, 6.43f)
                reflectiveCurveToRelative(73.24f, 1.93f, 94.3f, -6.43f)
                arcToRelative(54f, 54f, 0f, false, false, 30.41f, -30.41f)
                curveToRelative(8.35f, -21f, 6.43f, -71.05f, 6.43f, -94.33f)
                reflectiveCurveTo(357.1f, 182.74f, 348.75f, 161.67f)
                close()
                moveTo(224f, 338f)
                arcToRelative(82f, 82f, 0f, true, true, 82f, -82f)
                arcTo(81.9f, 81.9f, 0f, false, true, 224f, 338f)
                close()
                moveToRelative(85.38f, -148.3f)
                arcToRelative(19.14f, 19.14f, 0f, true, true, 19.13f, -19.14f)
                arcTo(19.1f, 19.1f, 0f, false, true, 309.42f, 189.74f)
                close()
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                arcTo(48f, 48f, 0f, false, false, 0f, 80f)
                verticalLineTo(432f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, 48f)
                horizontalLineTo(400f)
                arcToRelative(48f, 48f, 0f, false, false, 48f, -48f)
                verticalLineTo(80f)
                arcTo(48f, 48f, 0f, false, false, 400f, 32f)
                close()
                moveTo(382.88f, 322f)
                curveToRelative(-1.29f, 25.63f, -7.14f, 48.34f, -25.85f, 67f)
                reflectiveCurveToRelative(-41.4f, 24.63f, -67f, 25.85f)
                curveToRelative(-26.41f, 1.49f, -105.59f, 1.49f, -132f, 0f)
                curveToRelative(-25.63f, -1.29f, -48.26f, -7.15f, -67f, -25.85f)
                reflectiveCurveToRelative(-24.63f, -41.42f, -25.85f, -67f)
                curveToRelative(-1.49f, -26.42f, -1.49f, -105.61f, 0f, -132f)
                curveToRelative(1.29f, -25.63f, 7.07f, -48.34f, 25.85f, -67f)
                reflectiveCurveToRelative(41.47f, -24.56f, 67f, -25.78f)
                curveToRelative(26.41f, -1.49f, 105.59f, -1.49f, 132f, 0f)
                curveToRelative(25.63f, 1.29f, 48.33f, 7.15f, 67f, 25.85f)
                reflectiveCurveToRelative(24.63f, 41.42f, 25.85f, 67.05f)
                curveTo(384.37f, 216.44f, 384.37f, 295.56f, 382.88f, 322f)
                close()
            }
        }.build()
        
        return _InstagramSquare!!
    }

private var _InstagramSquare: ImageVector? = null

