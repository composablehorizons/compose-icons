package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Assistant: ImageVector
    get() {
        if (_Assistant != null) return _Assistant!!
        
        _Assistant = ImageVector.Builder(
            name = "assistant",
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
                moveTo(19f, 2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-0.59f, 0.59f)
                lineTo(12f, 20.17f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-0.58f, -0.58f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-7f, -1f)
                lineToRelative(1.88f, -4.12f)
                lineTo(18f, 11f)
                lineToRelative(-4.12f, -1.88f)
                lineTo(12f, 5f)
                lineToRelative(-1.88f, 4.12f)
                lineTo(6f, 11f)
                lineToRelative(4.12f, 1.88f)
                close()
            }
        }.build()
        
        return _Assistant!!
    }

private var _Assistant: ImageVector? = null

