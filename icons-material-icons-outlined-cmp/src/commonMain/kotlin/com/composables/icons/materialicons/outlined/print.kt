package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Print: ImageVector
    get() {
        if (_Print != null) return _Print!!
        
        _Print = ImageVector.Builder(
            name = "print",
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
                moveTo(19f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                horizontalLineTo(5f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                close()
                moveToRelative(8f, 12f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 11.5f)
                arcTo(1f, 1f, 0f, false, true, 18f, 12.5f)
                arcTo(1f, 1f, 0f, false, true, 17f, 11.5f)
                arcTo(1f, 1f, 0f, false, true, 19f, 11.5f)
                close()
            }
        }.build()
        
        return _Print!!
    }

private var _Print: ImageVector? = null

