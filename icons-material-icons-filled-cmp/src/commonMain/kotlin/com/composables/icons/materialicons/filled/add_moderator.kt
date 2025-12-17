package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Add_moderator: ImageVector
    get() {
        if (_Add_moderator != null) return _Add_moderator!!
        
        _Add_moderator = ImageVector.Builder(
            name = "add_moderator",
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
                moveTo(13.22f, 22.61f)
                curveToRelative(-0.4f, 0.15f, -0.8f, 0.29f, -1.22f, 0.39f)
                curveToRelative(-5.16f, -1.26f, -9f, -6.45f, -9f, -12f)
                verticalLineTo(5f)
                lineToRelative(9f, -4f)
                lineToRelative(9f, 4f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.9f, -0.11f, 1.78f, -0.3f, 2.65f)
                curveToRelative(-0.81f, -0.41f, -1.73f, -0.65f, -2.7f, -0.65f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 1.36f, 0.46f, 2.61f, 1.22f, 3.61f)
                close()
                moveTo(19f, 20f)
                verticalLineToRelative(2.99f)
                reflectiveCurveToRelative(-1.99f, 0.01f, -2f, 0f)
                verticalLineTo(20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Add_moderator!!
    }

private var _Add_moderator: ImageVector? = null

