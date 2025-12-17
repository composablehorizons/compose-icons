package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Face_nod: ImageVector
    get() {
        if (_Face_nod != null) return _Face_nod!!
        
        _Face_nod = ImageVector.Builder(
            name = "face_nod",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 800f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadToRelative(-227f, 93f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -11f, -1f, -21f)
                reflectiveQuadToRelative(-3f, -21f)
                quadToRelative(-74f, 8f, -143f, -16.5f)
                reflectiveQuadTo(332f, 344f)
                quadToRelative(-38f, 52f, -93.5f, 86f)
                reflectiveQuadTo(120f, 475f)
                quadToRelative(-2f, 101f, 68f, 173f)
                reflectiveQuadToRelative(172f, 72f)
                close()
                moveTo(260f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(220f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(260f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(300f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(260f, 560f)
                close()
                moveToRelative(200f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(420f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(460f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(500f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(460f, 560f)
                close()
                moveTo(296f, 249f)
                quadToRelative(-54f, 15f, -95f, 51.5f)
                reflectiveQuadTo(138f, 388f)
                quadToRelative(53f, -16f, 94f, -52.5f)
                reflectiveQuadToRelative(64f, -86.5f)
                close()
                moveToRelative(57f, -9f)
                quadToRelative(33f, 57f, 90.5f, 89.5f)
                reflectiveQuadTo(567f, 360f)
                quadToRelative(-33f, -57f, -90.5f, -89.5f)
                reflectiveQuadTo(353f, 240f)
                close()
                moveToRelative(-57f, 9f)
                close()
                moveToRelative(57f, -9f)
                close()
                moveToRelative(387f, 556f)
                quadToRelative(58f, -66f, 89f, -147f)
                reflectiveQuadToRelative(31f, -169f)
                quadToRelative(0f, -88f, -31f, -169f)
                reflectiveQuadToRelative(-89f, -147f)
                verticalLineToRelative(86f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(710f, 280f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(680f, 250f)
                verticalLineToRelative(-130f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(720f, 80f)
                horizontalLineToRelative(130f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 110f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 140f)
                horizontalLineToRelative(-51f)
                quadToRelative(59f, 72f, 90f, 159f)
                reflectiveQuadToRelative(31f, 181f)
                quadToRelative(0f, 94f, -31f, 181f)
                reflectiveQuadToRelative(-90f, 159f)
                horizontalLineToRelative(51f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(880f, 850f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 880f)
                horizontalLineTo(720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-130f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(710f, 680f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(740f, 710f)
                verticalLineToRelative(86f)
                close()
            }
        }.build()
        
        return _Face_nod!!
    }

private var _Face_nod: ImageVector? = null

