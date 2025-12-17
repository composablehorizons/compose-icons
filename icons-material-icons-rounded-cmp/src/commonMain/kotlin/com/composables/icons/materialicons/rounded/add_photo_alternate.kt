package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Add_photo_alternate: ImageVector
    get() {
        if (_Add_photo_alternate != null) return _Add_photo_alternate!!
        
        _Add_photo_alternate = ImageVector.Builder(
            name = "add_photo_alternate",
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
                moveTo(21.02f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(2.98f)
                curveToRelative(0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -0.99f, 0.98f)
                verticalLineTo(5f)
                horizontalLineToRelative(-2.01f)
                curveToRelative(-0.54f, 0f, -0.98f, 0.44f, -0.99f, 0.98f)
                verticalLineToRelative(0.03f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                horizontalLineTo(17f)
                verticalLineToRelative(2.01f)
                curveToRelative(0f, 0.54f, 0.44f, 0.99f, 0.99f, 0.98f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.54f, 0f, 0.98f, -0.44f, 0.98f, -0.98f)
                verticalLineTo(7f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.54f, 0f, 0.98f, -0.44f, 0.98f, -0.98f)
                verticalLineToRelative(-0.04f)
                curveToRelative(0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f)
                close()
                moveTo(16f, 9.01f)
                verticalLineTo(8f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.53f, 0f, -1.03f, -0.21f, -1.41f, -0.58f)
                curveToRelative(-0.37f, -0.38f, -0.58f, -0.88f, -0.58f, -1.44f)
                curveToRelative(0f, -0.36f, 0.1f, -0.69f, 0.27f, -0.98f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-8.28f)
                curveToRelative(-0.3f, 0.17f, -0.64f, 0.28f, -1.02f, 0.28f)
                curveToRelative(-1.09f, -0.01f, -1.98f, -0.9f, -1.98f, -1.99f)
                close()
                moveTo(15.96f, 19f)
                horizontalLineTo(6f)
                curveToRelative(-0.41f, 0f, -0.65f, -0.47f, -0.4f, -0.8f)
                lineToRelative(1.98f, -2.63f)
                curveToRelative(0.21f, -0.28f, 0.62f, -0.26f, 0.82f, 0.02f)
                lineTo(10f, 18f)
                lineToRelative(2.61f, -3.48f)
                curveToRelative(0.2f, -0.26f, 0.59f, -0.27f, 0.79f, -0.01f)
                lineToRelative(2.95f, 3.68f)
                curveToRelative(0.26f, 0.33f, 0.03f, 0.81f, -0.39f, 0.81f)
                close()
            }
        }.build()
        
        return _Add_photo_alternate!!
    }

private var _Add_photo_alternate: ImageVector? = null

