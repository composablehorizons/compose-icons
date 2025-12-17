package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Browser_updated: ImageVector
    get() {
        if (_Browser_updated != null) return _Browser_updated!!
        
        _Browser_updated = ImageVector.Builder(
            name = "browser_updated",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 13f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                lineToRelative(1f, -1f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                lineToRelative(8f, 0f)
                verticalLineToRelative(2f)
                lineTo(4f, 5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                horizontalLineTo(22f)
                close()
                moveTo(15f, 15f)
                lineToRelative(-5f, -5f)
                lineToRelative(1.41f, -1.41f)
                lineTo(14f, 11.17f)
                verticalLineTo(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.17f)
                lineToRelative(2.59f, -2.58f)
                lineTo(20f, 10f)
                lineTo(15f, 15f)
                close()
            }
        }.build()
        
        return _Browser_updated!!
    }

private var _Browser_updated: ImageVector? = null

