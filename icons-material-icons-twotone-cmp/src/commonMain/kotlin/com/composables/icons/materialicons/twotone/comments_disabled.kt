package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Comments_disabled: ImageVector
    get() {
        if (_Comments_disabled != null) return _Comments_disabled!!
        
        _Comments_disabled = ImageVector.Builder(
            name = "comments_disabled",
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
                moveTo(6.83f, 4f)
                horizontalLineTo(20f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineToRelative(-6.17f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(8.83f)
                lineTo(6.83f, 4f)
                close()
                moveTo(13.17f, 16f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(0.17f)
                lineTo(4f, 6.83f)
                verticalLineTo(16f)
                horizontalLineTo(13.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.83f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(6.83f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(20f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineToRelative(0f, 15.17f)
                lineTo(18.83f, 16f)
                close()
                moveTo(18f, 6f)
                horizontalLineTo(8.83f)
                lineToRelative(2f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-6.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                close()
                moveTo(18f, 14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(2f, 2f)
                horizontalLineTo(18f)
                close()
                moveTo(21.9f, 21.9f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(15.17f, 18f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(4.83f)
                lineTo(0.69f, 3.51f)
                lineTo(2.1f, 2.1f)
                lineTo(21.9f, 21.9f)
                close()
                moveTo(13.17f, 16f)
                lineToRelative(-2f, -2f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-1f, -1f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(0.17f)
                lineTo(4f, 6.83f)
                verticalLineTo(16f)
                horizontalLineTo(13.17f)
                close()
            }
        }.build()
        
        return _Comments_disabled!!
    }

private var _Comments_disabled: ImageVector? = null

