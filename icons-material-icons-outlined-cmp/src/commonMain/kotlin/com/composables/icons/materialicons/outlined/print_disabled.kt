package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Print_disabled: ImageVector
    get() {
        if (_Print_disabled != null) return _Print_disabled!!
        
        _Print_disabled = ImageVector.Builder(
            name = "print_disabled",
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
                moveTo(1.41f, 1.6f)
                lineTo(0f, 3.01f)
                lineTo(5f, 8f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                lineToRelative(2.95f, 2.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(1.41f, 1.6f)
                close()
                moveTo(6f, 15f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2f, 4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                lineToRelative(4f, 4f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5.34f)
                lineToRelative(2f, 2f)
                horizontalLineTo(19f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                lineToRelative(-2f, 0.01f)
                verticalLineTo(13f)
                horizontalLineToRelative(-2.34f)
                lineToRelative(4f, 4f)
                horizontalLineTo(22f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(0.36f)
                lineToRelative(2f, 2f)
                verticalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 11.51f)
                arcTo(1f, 1f, 0f, false, true, 18f, 12.51f)
                arcTo(1f, 1f, 0f, false, true, 17f, 11.51f)
                arcTo(1f, 1f, 0f, false, true, 19f, 11.51f)
                close()
            }
        }.build()
        
        return _Print_disabled!!
    }

private var _Print_disabled: ImageVector? = null

