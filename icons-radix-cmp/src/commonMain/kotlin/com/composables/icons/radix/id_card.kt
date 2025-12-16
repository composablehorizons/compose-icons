package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.IdCard: ImageVector
    get() {
        if (_IdCard != null) return _IdCard!!
        
        _IdCard = ImageVector.Builder(
            name = "id-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 3.00006f)
                curveTo(14.5523f, 3.00006f, 15f, 3.44778f, 15f, 4.00006f)
                verticalLineTo(11.0001f)
                curveTo(15f, 11.5523f, 14.5523f, 12.0001f, 14f, 12.0001f)
                horizontalLineTo(1f)
                lineTo(0.897461f, 11.9952f)
                curveTo(0.393331f, 11.9438f, 0f, 11.5177f, 0f, 11.0001f)
                verticalLineTo(4.00006f)
                curveTo(0f, 3.44778f, 0.447715f, 3.00006f, 1f, 3.00006f)
                horizontalLineTo(14f)
                close()
                moveTo(1f, 11.0001f)
                horizontalLineTo(14f)
                verticalLineTo(4.00006f)
                horizontalLineTo(1f)
                verticalLineTo(11.0001f)
                close()
                moveTo(5.75f, 5.00006f)
                curveTo(5.88807f, 5.00006f, 6f, 5.11199f, 6f, 5.25006f)
                verticalLineTo(9.75006f)
                curveTo(5.99997f, 9.8881f, 5.88805f, 10.0001f, 5.75f, 10.0001f)
                horizontalLineTo(2.25f)
                curveTo(2.11195f, 10.0001f, 2.00003f, 9.8881f, 2f, 9.75006f)
                verticalLineTo(5.25006f)
                curveTo(2f, 5.11199f, 2.11193f, 5.00006f, 2.25f, 5.00006f)
                horizontalLineTo(5.75f)
                close()
                moveTo(12.5f, 9.00006f)
                curveTo(12.7761f, 9.00006f, 13f, 9.22392f, 13f, 9.50006f)
                curveTo(13f, 9.77618f, 12.7761f, 10.0001f, 12.5f, 10.0001f)
                horizontalLineTo(7.5f)
                curveTo(7.22388f, 10.0001f, 7.00003f, 9.77618f, 7f, 9.50006f)
                curveTo(7f, 9.22392f, 7.22386f, 9.00006f, 7.5f, 9.00006f)
                horizontalLineTo(12.5f)
                close()
                moveTo(10.5f, 7.00006f)
                curveTo(10.7761f, 7.00006f, 11f, 7.22392f, 11f, 7.50006f)
                curveTo(11f, 7.77618f, 10.7761f, 8.00006f, 10.5f, 8.00006f)
                horizontalLineTo(7.5f)
                curveTo(7.22388f, 8.00006f, 7.00003f, 7.77618f, 7f, 7.50006f)
                curveTo(7f, 7.22392f, 7.22386f, 7.00006f, 7.5f, 7.00006f)
                horizontalLineTo(10.5f)
                close()
                moveTo(11.5f, 5.00006f)
                curveTo(11.7761f, 5.00006f, 12f, 5.22392f, 12f, 5.50006f)
                curveTo(12f, 5.77618f, 11.7761f, 6.00006f, 11.5f, 6.00006f)
                horizontalLineTo(7.5f)
                curveTo(7.22388f, 6.00006f, 7.00003f, 5.77618f, 7f, 5.50006f)
                curveTo(7f, 5.22392f, 7.22386f, 5.00006f, 7.5f, 5.00006f)
                horizontalLineTo(11.5f)
                close()
            }
        }.build()
        
        return _IdCard!!
    }

private var _IdCard: ImageVector? = null

