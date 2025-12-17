package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pdf_off: ImageVector
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
                moveToRelative(-60f, 110f)
                verticalLineTo(496f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(260f, 456f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(380f, 496f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(340f, 616f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(50f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(250f, 696f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(220f, 666f)
                close()
                moveToRelative(236f, 30f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(416f, 656f)
                verticalLineTo(512f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-24f)
                lineToRelative(58f, 58f)
                quadToRelative(-5f, 12f, -15f, 19f)
                reflectiveQuadToRelative(-23f, 7f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -137f)
                lineToRelative(-52f, -51f)
                lineToRelative(-51f, -52f)
                horizontalLineToRelative(63f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(576f, 496f)
                verticalLineToRelative(63f)
                close()
                moveToRelative(104f, 104f)
                lineToRelative(-60f, -60f)
                verticalLineTo(496f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 456f)
                horizontalLineToRelative(50f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(740f, 486f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(710f, 516f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(30f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(740f, 586f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(710f, 616f)
                horizontalLineToRelative(-30f)
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
                moveToRelative(563f, 36f)
                lineTo(84f, 292f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 236f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(819f, 972f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(763f, 972f)
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

