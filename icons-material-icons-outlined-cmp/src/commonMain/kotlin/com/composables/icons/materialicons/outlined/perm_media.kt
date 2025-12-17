package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Perm_media: ImageVector
    get() {
        if (_Perm_media != null) return _Perm_media!!
        
        _Perm_media = ImageVector.Builder(
            name = "perm_media",
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
                moveTo(2f, 6f)
                horizontalLineTo(0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(0.01f)
                lineTo(0f, 20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                close()
                moveToRelative(5f, 9f)
                horizontalLineToRelative(14f)
                lineToRelative(-3.5f, -4.5f)
                lineToRelative(-2.5f, 3.01f)
                lineTo(11.5f, 9f)
                close()
                moveTo(22f, 4f)
                horizontalLineToRelative(-8f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(6f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(4f, 16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineToRelative(5.17f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(0.59f, 0.59f)
                horizontalLineTo(22f)
                verticalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _Perm_media!!
    }

private var _Perm_media: ImageVector? = null

