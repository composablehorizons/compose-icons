package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Phone_callback: ImageVector
    get() {
        if (_Phone_callback != null) return _Phone_callback!!
        
        _Phone_callback = ImageVector.Builder(
            name = "phone_callback",
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
                moveTo(6.62f, 10.79f)
                curveToRelative(1.44f, 2.83f, 3.76f, 5.14f, 6.59f, 6.59f)
                lineToRelative(2.2f, -2.2f)
                curveToRelative(0.27f, -0.27f, 0.67f, -0.36f, 1.02f, -0.24f)
                curveToRelative(1.12f, 0.37f, 2.33f, 0.57f, 3.57f, 0.57f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                curveToRelative(-9.39f, 0f, -17f, -7.61f, -17f, -17f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.25f, 0.2f, 2.45f, 0.57f, 3.57f)
                curveToRelative(0.11f, 0.35f, 0.03f, 0.74f, -0.25f, 1.02f)
                lineToRelative(-2.2f, 2.2f)
                close()
                moveToRelative(13.54f, -7.1f)
                lineToRelative(-0.71f, -0.7f)
                lineTo(13f, 9.29f)
                verticalLineTo(5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.15f)
                close()
            }
        }.build()
        
        return _Phone_callback!!
    }

private var _Phone_callback: ImageVector? = null

