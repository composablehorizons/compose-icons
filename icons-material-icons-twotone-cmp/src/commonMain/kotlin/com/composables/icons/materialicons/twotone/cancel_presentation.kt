package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Cancel_presentation: ImageVector
    get() {
        if (_Cancel_presentation != null) return _Cancel_presentation!!
        
        _Cancel_presentation = ImageVector.Builder(
            name = "cancel_presentation",
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
                moveTo(3f, 19.1f)
                horizontalLineToRelative(18f)
                verticalLineTo(4.95f)
                horizontalLineTo(3f)
                verticalLineTo(19.1f)
                close()
                moveToRelative(5f, -9.74f)
                lineToRelative(1.41f, -1.41f)
                lineTo(12f, 10.54f)
                lineToRelative(2.59f, -2.59f)
                lineTo(16f, 9.36f)
                lineToRelative(-2.59f, 2.59f)
                lineTo(16f, 14.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12f, 13.36f)
                lineToRelative(-2.59f, 2.59f)
                lineTo(8f, 14.54f)
                lineToRelative(2.59f, -2.59f)
                lineTo(8f, 9.36f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                close()
                moveTo(9.41f, 15.95f)
                lineTo(12f, 13.36f)
                lineToRelative(2.59f, 2.59f)
                lineTo(16f, 14.54f)
                lineToRelative(-2.59f, -2.59f)
                lineTo(16f, 9.36f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(12f, 10.54f)
                lineTo(9.41f, 7.95f)
                lineTo(8f, 9.36f)
                lineToRelative(2.59f, 2.59f)
                lineTo(8f, 14.54f)
                close()
            }
        }.build()
        
        return _Cancel_presentation!!
    }

private var _Cancel_presentation: ImageVector? = null

