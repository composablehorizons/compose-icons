package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Book_online: ImageVector
    get() {
        if (_Book_online != null) return _Book_online!!
        
        _Book_online = ImageVector.Builder(
            name = "book_online",
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
                moveTo(17f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(10f)
                verticalLineTo(4f)
                close()
                moveTo(17f, 21f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineTo(21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineToRelative(10f)
                verticalLineTo(4f)
                close()
                moveTo(17f, 21f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10f)
                verticalLineTo(21f)
                close()
                moveTo(17f, 1f)
                horizontalLineTo(7f)
                curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                verticalLineToRelative(18f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(3f)
                curveTo(19f, 1.9f, 18.1f, 1f, 17f, 1f)
                lineTo(17f, 1f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(12f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                close()
                moveTo(16f, 11f)
                verticalLineTo(9.14f)
                curveTo(16f, 8.51f, 15.55f, 8f, 15f, 8f)
                horizontalLineTo(9f)
                curveTo(8.45f, 8f, 8f, 8.51f, 8f, 9.14f)
                lineToRelative(0f, 1.96f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineToRelative(0f, 1.76f)
                curveTo(8f, 15.49f, 8.45f, 16f, 9f, 16f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.51f, 1f, -1.14f)
                verticalLineTo(13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveTo(15f, 11.45f, 15.45f, 11f, 16f, 11f)
                close()
                moveTo(12.5f, 14.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineTo(14.5f)
                close()
                moveTo(12.5f, 12.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineTo(12.5f)
                close()
                moveTo(12.5f, 10.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()
        
        return _Book_online!!
    }

private var _Book_online: ImageVector? = null

