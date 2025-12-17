package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Ticket: ImageVector
    get() {
        if (_Ticket != null) return _Ticket!!
        
        _Ticket = ImageVector.Builder(
            name = "ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.75f, 3f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 5.25f)
                verticalLineToRelative(1.214f)
                curveToRelative(0f, 0.423f, -0.277f, 0.788f, -0.633f, 1.019f)
                arcTo(2.997f, 2.997f, 0f, false, false, 16f, 10f)
                curveToRelative(0f, 1.055f, 0.544f, 1.982f, 1.367f, 2.517f)
                curveToRelative(0.356f, 0.231f, 0.633f, 0.596f, 0.633f, 1.02f)
                verticalLineToRelative(1.213f)
                arcTo(2.25f, 2.25f, 0f, false, true, 15.75f, 17f)
                horizontalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 14.75f)
                verticalLineToRelative(-1.213f)
                curveToRelative(0f, -0.424f, 0.277f, -0.789f, 0.633f, -1.02f)
                arcTo(2.998f, 2.998f, 0f, false, false, 4f, 10f)
                arcToRelative(2.997f, 2.997f, 0f, false, false, -1.367f, -2.517f)
                curveTo(2.277f, 7.252f, 2f, 6.887f, 2f, 6.463f)
                verticalLineTo(5.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.25f, 3f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(13.5f, 7.396f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.042f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(7.396f)
                close()
                moveToRelative(0f, 4.167f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(1.041f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1.041f)
                close()
            }
        }.build()
        
        return _Ticket!!
    }

private var _Ticket: ImageVector? = null

