package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Send: ImageVector
    get() {
        if (_Send != null) return _Send!!
        
        _Send = ImageVector.Builder(
            name = "send",
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
                moveTo(4.01f, 6.03f)
                lineToRelative(7.51f, 3.22f)
                lineToRelative(-7.52f, -1f)
                lineToRelative(0.01f, -2.22f)
                moveToRelative(7.5f, 8.72f)
                lineTo(4f, 17.97f)
                verticalLineToRelative(-2.22f)
                lineToRelative(7.51f, -1f)
                moveTo(2.01f, 3f)
                lineTo(2f, 10f)
                lineToRelative(15f, 2f)
                lineToRelative(-15f, 2f)
                lineToRelative(0.01f, 7f)
                lineTo(23f, 12f)
                lineTo(2.01f, 3f)
                close()
            }
        }.build()
        
        return _Send!!
    }

private var _Send: ImageVector? = null

