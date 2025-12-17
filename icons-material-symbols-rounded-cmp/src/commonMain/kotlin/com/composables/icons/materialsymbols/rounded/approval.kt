package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Approval: ImageVector
    get() {
        if (_Approval != null) return _Approval!!
        
        _Approval = ImageVector.Builder(
            name = "approval",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 560f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(40f, -160f)
                horizontalLineToRelative(400f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 640f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(167f, -206f)
                lineTo(299f, 307f)
                quadToRelative(-9f, -13f, -12.5f, -28.5f)
                reflectiveQuadTo(285f, 247f)
                quadToRelative(12f, -73f, 66f, -120f)
                reflectiveQuadToRelative(129f, -47f)
                quadToRelative(75f, 0f, 129f, 47f)
                reflectiveQuadToRelative(66f, 120f)
                quadToRelative(2f, 16f, -1.5f, 31.5f)
                reflectiveQuadTo(661f, 307f)
                lineTo(513f, 514f)
                quadToRelative(-12f, 17f, -33f, 17f)
                reflectiveQuadToRelative(-33f, -17f)
                close()
                moveToRelative(33f, -66f)
                lineToRelative(120f, -168f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                lineToRelative(120f, 168f)
                close()
                moveToRelative(0f, -144f)
                close()
            }
        }.build()
        
        return _Approval!!
    }

private var _Approval: ImageVector? = null

