package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Contacts: ImageVector
    get() {
        if (_Contacts != null) return _Contacts!!
        
        _Contacts = ImageVector.Builder(
            name = "contacts",
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
                moveTo(20f, 0f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(16f)
                verticalLineTo(0f)
                close()
                moveTo(4f, 24f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineToRelative(2f)
                close()
                moveTo(22f, 4f)
                horizontalLineTo(2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(20f)
                verticalLineTo(4f)
                close()
                moveTo(12f, 6.75f)
                curveToRelative(1.24f, 0f, 2.25f, 1.01f, 2.25f, 2.25f)
                reflectiveCurveToRelative(-1.01f, 2.25f, -2.25f, 2.25f)
                reflectiveCurveTo(9.75f, 10.24f, 9.75f, 9f)
                reflectiveCurveTo(10.76f, 6.75f, 12f, 6.75f)
                close()
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.67f, 3.33f, -2.5f, 5f, -2.5f)
                reflectiveCurveToRelative(5f, 0.83f, 5f, 2.5f)
                verticalLineTo(17f)
                close()
            }
        }.build()
        
        return _Contacts!!
    }

private var _Contacts: ImageVector? = null

