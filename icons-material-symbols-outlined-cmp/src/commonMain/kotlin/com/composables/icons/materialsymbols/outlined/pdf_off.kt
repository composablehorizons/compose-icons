package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pdf_off: ImageVector
    get() {
        if (_Pdf_off != null) return _Pdf_off!!
        
        _Pdf_off = ImageVector.Builder(
            name = "pdf_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 556f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(40f)
                close()
                moveToRelative(-60f, 140f)
                verticalLineTo(456f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(380f, 496f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 616f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(196f, 0f)
                verticalLineTo(512f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-24f)
                lineToRelative(58f, 58f)
                quadToRelative(-5f, 12f, -15f, 19f)
                reflectiveQuadToRelative(-23f, 7f)
                horizontalLineTo(416f)
                close()
                moveToRelative(160f, -137f)
                lineToRelative(-52f, -51f)
                lineToRelative(-51f, -52f)
                horizontalLineToRelative(63f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(576f, 496f)
                verticalLineToRelative(63f)
                close()
                moveToRelative(104f, 104f)
                lineToRelative(-60f, -60f)
                verticalLineTo(456f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(47f)
                close()
                moveToRelative(160f, 160f)
                lineToRelative(-80f, -80f)
                verticalLineTo(296f)
                horizontalLineTo(313f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(527f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 296f)
                verticalLineToRelative(527f)
                close()
                moveTo(200f, 936f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 856f)
                verticalLineTo(296f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(57f, 56f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                lineToRelative(56f, 57f)
                quadToRelative(-11f, 11f, -25.5f, 17f)
                reflectiveQuadToRelative(-30.5f, 6f)
                horizontalLineTo(200f)
                close()
                moveToRelative(591f, 64f)
                lineTo(56f, 264f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 56f)
                close()
                moveTo(424f, 632f)
                close()
                moveToRelative(113f, -113f)
                close()
            }
        }.build()
        
        return _Pdf_off!!
    }

private var _Pdf_off: ImageVector? = null

