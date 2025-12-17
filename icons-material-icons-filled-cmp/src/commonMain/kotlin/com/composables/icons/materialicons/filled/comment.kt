package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Comment: ImageVector
    get() {
        if (_Comment != null) return _Comment!!
        
        _Comment = ImageVector.Builder(
            name = "comment",
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
                moveTo(21.99f, 4f)
                curveToRelative(0f, -1.1f, -0.89f, -2f, -1.99f, -2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                lineToRelative(4f, 4f)
                lineToRelative(-0.01f, -18f)
                close()
                moveTo(18f, 14f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Comment!!
    }

private var _Comment: ImageVector? = null

