package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Mail_lock: ImageVector
    get() {
        if (_Mail_lock != null) return _Mail_lock!!
        
        _Mail_lock = ImageVector.Builder(
            name = "mail_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 360f)
                verticalLineToRelative(-40f)
                lineTo(501f, 507f)
                quadToRelative(-5f, 3f, -10.5f, 4.5f)
                reflectiveQuadTo(480f, 513f)
                quadToRelative(-5f, 0f, -10.5f, -1.5f)
                reflectiveQuadTo(459f, 507f)
                lineTo(160f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(440f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(640f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(600f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(320f, -360f)
                lineToRelative(320f, -200f)
                horizontalLineTo(160f)
                lineToRelative(320f, 200f)
                close()
                moveTo(160f, 720f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(10f)
                verticalLineToRelative(-59f)
                verticalLineToRelative(1f)
                verticalLineToRelative(-32f)
                verticalLineToRelative(32f)
                verticalLineToRelative(-0.5f)
                verticalLineToRelative(58.5f)
                verticalLineToRelative(-10f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(600f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 560f)
                verticalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(960f, 640f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(920f, 800f)
                horizontalLineTo(760f)
                close()
                moveToRelative(40f, -200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(840f, 520f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(800f, 560f)
                verticalLineToRelative(40f)
                close()
            }
        }.build()
        
        return _Mail_lock!!
    }

private var _Mail_lock: ImageVector? = null

