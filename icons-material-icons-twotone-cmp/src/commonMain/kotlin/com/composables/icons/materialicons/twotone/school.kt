package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.School: ImageVector
    get() {
        if (_School != null) return _School!!
        
        _School = ImageVector.Builder(
            name = "school",
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
                moveTo(7f, 12.27f)
                verticalLineToRelative(3.72f)
                lineToRelative(5f, 2.73f)
                lineToRelative(5f, -2.73f)
                verticalLineToRelative(-3.72f)
                lineTo(12f, 15f)
                close()
                moveTo(5.18f, 9f)
                lineTo(12f, 12.72f)
                lineTo(18.82f, 9f)
                lineTo(12f, 5.28f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                lineTo(1f, 9f)
                lineToRelative(4f, 2.18f)
                verticalLineToRelative(6f)
                lineTo(12f, 21f)
                lineToRelative(7f, -3.82f)
                verticalLineToRelative(-6f)
                lineToRelative(2f, -1.09f)
                verticalLineTo(17f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                lineTo(12f, 3f)
                close()
                moveToRelative(5f, 12.99f)
                lineToRelative(-5f, 2.73f)
                lineToRelative(-5f, -2.73f)
                verticalLineToRelative(-3.72f)
                lineTo(12f, 15f)
                lineToRelative(5f, -2.73f)
                verticalLineToRelative(3.72f)
                close()
                moveToRelative(-5f, -3.27f)
                lineTo(5.18f, 9f)
                lineTo(12f, 5.28f)
                lineTo(18.82f, 9f)
                lineTo(12f, 12.72f)
                close()
            }
        }.build()
        
        return _School!!
    }

private var _School: ImageVector? = null

