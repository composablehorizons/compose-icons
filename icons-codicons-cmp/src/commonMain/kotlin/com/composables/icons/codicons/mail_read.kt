package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.MailRead: ImageVector
    get() {
        if (_MailRead != null) return _MailRead!!
        
        _MailRead = ImageVector.Builder(
            name = "mail-read",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.839f, 3.64402f)
                lineTo(8.419f, 1.14302f)
                curveTo(8.153f, 1.02002f, 7.848f, 1.02102f, 7.58f, 1.14302f)
                lineTo(2.161f, 3.64402f)
                curveTo(1.456f, 3.97002f, 1f, 4.68302f, 1f, 5.46002f)
                verticalLineTo(11f)
                curveTo(1f, 12.103f, 1.897f, 13f, 3f, 13f)
                horizontalLineTo(13f)
                curveTo(14.103f, 13f, 15f, 12.103f, 15f, 11f)
                verticalLineTo(5.46002f)
                curveTo(15f, 4.68202f, 14.544f, 3.96902f, 13.839f, 3.64402f)
                close()
                moveTo(2.581f, 4.55202f)
                lineTo(8f, 2.05102f)
                lineTo(13.419f, 4.55202f)
                curveTo(13.697f, 4.68002f, 13.897f, 4.92802f, 13.969f, 5.21802f)
                lineTo(8f, 8.43302f)
                lineTo(2.031f, 5.21802f)
                curveTo(2.104f, 4.92802f, 2.303f, 4.68002f, 2.581f, 4.55202f)
                close()
                moveTo(13f, 12f)
                horizontalLineTo(3f)
                curveTo(2.448f, 12f, 2f, 11.552f, 2f, 11f)
                verticalLineTo(6.33702f)
                lineTo(7.763f, 9.44002f)
                curveTo(7.837f, 9.48002f, 7.919f, 9.50002f, 8f, 9.50002f)
                curveTo(8.081f, 9.50002f, 8.163f, 9.48002f, 8.237f, 9.44002f)
                lineTo(14f, 6.33702f)
                verticalLineTo(11f)
                curveTo(14f, 11.552f, 13.552f, 12f, 13f, 12f)
                close()
            }
        }.build()
        
        return _MailRead!!
    }

private var _MailRead: ImageVector? = null

