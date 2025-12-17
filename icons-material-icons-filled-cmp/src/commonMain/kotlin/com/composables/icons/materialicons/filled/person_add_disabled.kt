package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Person_add_disabled: ImageVector
    get() {
        if (_Person_add_disabled != null) return _Person_add_disabled!!
        
        _Person_add_disabled = ImageVector.Builder(
            name = "person_add_disabled",
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
                moveTo(19f, 8f)
                arcTo(4f, 4f, 0f, false, true, 15f, 12f)
                arcTo(4f, 4f, 0f, false, true, 11f, 8f)
                arcTo(4f, 4f, 0f, false, true, 19f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23f, 20f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.3f, -4.1f, -3.7f, -6.9f, -3.9f)
                lineToRelative(6f, 5.9f)
                horizontalLineToRelative(0.9f)
                close()
                moveToRelative(-11.6f, -5.5f)
                curveTo(9.2f, 15.1f, 7f, 16.3f, 7f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.9f)
                lineToRelative(4f, 4f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-21f, -20.9f)
                lineTo(0f, 3.1f)
                lineToRelative(4f, 4f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.9f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(6f, 10f)
                verticalLineToRelative(-0.9f)
                lineToRelative(0.9f, 0.9f)
                horizontalLineTo(6f)
                close()
            }
        }.build()
        
        return _Person_add_disabled!!
    }

private var _Person_add_disabled: ImageVector? = null

