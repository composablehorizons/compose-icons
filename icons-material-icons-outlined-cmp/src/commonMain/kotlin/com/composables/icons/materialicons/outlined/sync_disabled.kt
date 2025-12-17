package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sync_disabled: ImageVector
    get() {
        if (_Sync_disabled != null) return _Sync_disabled!!
        
        _Sync_disabled = ImageVector.Builder(
            name = "sync_disabled",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 6.35f)
                verticalLineTo(4.26f)
                curveToRelative(-0.66f, 0.17f, -1.29f, 0.43f, -1.88f, 0.75f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.13f, -0.05f, 0.25f, -0.11f, 0.38f, -0.16f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f)
                lineTo(20f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                lineToRelative(2.24f, -2.24f)
                curveTo(17.32f, 8.85f, 18f, 10.34f, 18f, 12f)
                curveToRelative(0f, 0.85f, -0.19f, 1.65f, -0.51f, 2.38f)
                lineToRelative(1.5f, 1.5f)
                curveTo(19.63f, 14.74f, 20f, 13.41f, 20f, 12f)
                close()
                moveTo(4.27f, 4f)
                lineTo(2.86f, 5.41f)
                lineToRelative(2.36f, 2.36f)
                curveTo(4.45f, 8.99f, 4f, 10.44f, 4f, 12f)
                curveToRelative(0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f)
                lineTo(4f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                lineToRelative(-2.24f, 2.24f)
                curveTo(6.68f, 15.15f, 6f, 13.66f, 6f, 12f)
                curveToRelative(0f, -1f, 0.25f, -1.94f, 0.68f, -2.77f)
                lineToRelative(8.08f, 8.08f)
                curveToRelative(-0.25f, 0.13f, -0.5f, 0.24f, -0.76f, 0.34f)
                verticalLineToRelative(2.09f)
                curveToRelative(0.8f, -0.21f, 1.55f, -0.54f, 2.23f, -0.96f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.27f, 4f)
                close()
            }
        }.build()
        
        return _Sync_disabled!!
    }

private var _Sync_disabled: ImageVector? = null

