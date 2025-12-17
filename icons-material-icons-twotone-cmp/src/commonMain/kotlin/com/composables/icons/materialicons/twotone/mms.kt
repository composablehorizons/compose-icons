package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mms: ImageVector
    get() {
        if (_Mms != null) return _Mms!!
        
        _Mms = ImageVector.Builder(
            name = "mms",
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
                moveTo(4f, 17.17f)
                lineTo(5.17f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(13.17f)
                close()
                moveTo(8.5f, 9.5f)
                lineToRelative(2.5f, 3.01f)
                lineTo(14.5f, 8f)
                lineToRelative(4.5f, 6f)
                horizontalLineTo(5f)
                lineToRelative(3.5f, -4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(18f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(5.17f)
                lineTo(4f, 17.17f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
                moveToRelative(-5.5f, -8f)
                lineTo(11f, 12.51f)
                lineTo(8.5f, 9.5f)
                lineTo(5f, 14f)
                horizontalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Mms!!
    }

private var _Mms: ImageVector? = null

