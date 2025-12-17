package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Collections_bookmark: ImageVector
    get() {
        if (_Collections_bookmark != null) return _Collections_bookmark!!
        
        _Collections_bookmark = ImageVector.Builder(
            name = "collections_bookmark",
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
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
                moveToRelative(16f, -4f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-3f, 2f)
                verticalLineToRelative(5f)
                lineToRelative(-1f, -0.75f)
                lineTo(15f, 9f)
                verticalLineTo(4f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(3f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(9f)
                lineToRelative(3f, -2.25f)
                lineTo(19f, 13f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                close()
            }
        }.build()
        
        return _Collections_bookmark!!
    }

private var _Collections_bookmark: ImageVector? = null

