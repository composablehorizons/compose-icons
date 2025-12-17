package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Edit_note: ImageVector
    get() {
        if (_Edit_note != null) return _Edit_note!!
        
        _Edit_note = ImageVector.Builder(
            name = "edit_note",
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
                moveTo(3f, 10f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(11f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                close()
                moveTo(18.01f, 12.87f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(0.71f, 0.71f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(18.01f, 12.87f)
                close()
                moveTo(17.3f, 13.58f)
                lineToRelative(-5.3f, 5.3f)
                verticalLineTo(21f)
                horizontalLineToRelative(2.12f)
                lineToRelative(5.3f, -5.3f)
                lineTo(17.3f, 13.58f)
                close()
            }
        }.build()
        
        return _Edit_note!!
    }

private var _Edit_note: ImageVector? = null

