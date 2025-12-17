package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Delete_forever: ImageVector
    get() {
        if (_Delete_forever != null) return _Delete_forever!!
        
        _Delete_forever = ImageVector.Builder(
            name = "delete_forever",
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
                moveTo(14.12f, 10.47f)
                lineTo(12f, 12.59f)
                lineToRelative(-2.13f, -2.12f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(10.59f, 14f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12f, 15.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 14f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(15.5f, 4f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-5f)
                lineToRelative(-1f, 1f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineTo(4f)
                close()
                moveTo(6f, 19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineToRelative(12f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Delete_forever!!
    }

private var _Delete_forever: ImageVector? = null

