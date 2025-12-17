package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_phone: ImageVector
    get() {
        if (_Local_phone != null) return _Local_phone!!
        
        _Local_phone = ImageVector.Builder(
            name = "local_phone",
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
                moveTo(19f, 17.47f)
                curveToRelative(-0.88f, -0.07f, -1.75f, -0.22f, -2.6f, -0.45f)
                lineToRelative(-1.19f, 1.19f)
                curveToRelative(1.2f, 0.41f, 2.48f, 0.67f, 3.8f, 0.75f)
                verticalLineToRelative(-1.49f)
                close()
                moveTo(6.99f, 7.59f)
                curveToRelative(-0.24f, -0.83f, -0.39f, -1.7f, -0.45f, -2.59f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0.09f, 1.32f, 0.35f, 2.59f, 0.75f, 3.8f)
                lineToRelative(1.2f, -1.21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 4f)
                curveToRelative(0f, 9.39f, 7.61f, 17f, 17f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.49f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-1.24f, 0f, -2.45f, -0.2f, -3.57f, -0.57f)
                curveToRelative(-0.1f, -0.04f, -0.21f, -0.05f, -0.31f, -0.05f)
                curveToRelative(-0.26f, 0f, -0.51f, 0.1f, -0.71f, 0.29f)
                lineToRelative(-2.2f, 2.2f)
                curveToRelative(-2.83f, -1.45f, -5.15f, -3.76f, -6.59f, -6.59f)
                lineToRelative(2.2f, -2.2f)
                curveToRelative(0.28f, -0.28f, 0.36f, -0.67f, 0.25f, -1.02f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveToRelative(13.4f, 13.02f)
                curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f)
                verticalLineToRelative(1.49f)
                curveToRelative(-1.32f, -0.09f, -2.59f, -0.35f, -3.8f, -0.75f)
                lineToRelative(1.2f, -1.19f)
                close()
                moveTo(6.54f, 5f)
                curveToRelative(0.06f, 0.89f, 0.21f, 1.76f, 0.45f, 2.59f)
                lineToRelative(-1.2f, 1.2f)
                curveToRelative(-0.41f, -1.2f, -0.67f, -2.47f, -0.76f, -3.79f)
                horizontalLineToRelative(1.51f)
                close()
            }
        }.build()
        
        return _Local_phone!!
    }

private var _Local_phone: ImageVector? = null

