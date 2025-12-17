package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.New_label: ImageVector
    get() {
        if (_New_label != null) return _New_label!!
        
        _New_label = ImageVector.Builder(
            name = "new_label",
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
                moveTo(21f, 12f)
                lineToRelative(-4.37f, 6.16f)
                curveTo(16.26f, 18.68f, 15.65f, 19f, 15f, 19f)
                horizontalLineToRelative(-3f)
                lineToRelative(0f, -2f)
                horizontalLineToRelative(3f)
                lineToRelative(3.55f, -5f)
                lineTo(15f, 7f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                curveToRelative(0.65f, 0f, 1.26f, 0.31f, 1.63f, 0.84f)
                lineTo(21f, 12f)
                close()
                moveTo(10f, 15f)
                horizontalLineTo(7f)
                verticalLineToRelative(-3f)
                horizontalLineTo(5f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineTo(15f)
                close()
            }
        }.build()
        
        return _New_label!!
    }

private var _New_label: ImageVector? = null

