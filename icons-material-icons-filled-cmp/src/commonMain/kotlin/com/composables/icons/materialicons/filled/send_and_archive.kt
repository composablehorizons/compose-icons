package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Send_and_archive: ImageVector
    get() {
        if (_Send_and_archive != null) return _Send_and_archive!!
        
        _Send_and_archive = ImageVector.Builder(
            name = "send_and_archive",
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
                moveTo(21f, 10f)
                horizontalLineToRelative(-3f)
                lineTo(2f, 3f)
                verticalLineToRelative(7f)
                lineToRelative(9f, 2f)
                lineToRelative(-9f, 2f)
                verticalLineToRelative(7f)
                lineToRelative(8f, -3.5f)
                verticalLineTo(21f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 11f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(9f)
                close()
                moveToRelative(-4.5f, -1f)
                lineTo(13f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                lineToRelative(-3.5f, 4f)
                close()
            }
        }.build()
        
        return _Send_and_archive!!
    }

private var _Send_and_archive: ImageVector? = null

