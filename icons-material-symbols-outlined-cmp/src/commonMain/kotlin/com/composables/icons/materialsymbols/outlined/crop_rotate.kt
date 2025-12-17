package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Crop_rotate: ImageVector
    get() {
        if (_Crop_rotate != null) return _Crop_rotate!!
        
        _Crop_rotate = ImageVector.Builder(
            name = "crop_rotate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 960f)
                quadToRelative(-94f, 0f, -177.5f, -33.5f)
                reflectiveQuadToRelative(-148f, -93f)
                quadTo(90f, 774f, 49f, 693.5f)
                reflectiveQuadTo(0f, 520f)
                horizontalLineToRelative(80f)
                quadToRelative(8f, 72f, 38.5f, 134.5f)
                reflectiveQuadToRelative(79f, 110.5f)
                quadTo(246f, 813f, 309f, 842.5f)
                reflectiveQuadTo(444f, 878f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -56f)
                lineTo(618f, 940f)
                quadTo(584f, 951f, 549.5f, 955.5f)
                reflectiveQuadTo(480f, 960f)
                close()
                moveToRelative(120f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(360f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 360f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(280f, -80f)
                quadToRelative(-7f, -72f, -38f, -134.5f)
                reflectiveQuadTo(762.5f, 195f)
                quadTo(714f, 147f, 651f, 117.5f)
                reflectiveQuadTo(516f, 82f)
                lineToRelative(62f, 62f)
                lineToRelative(-56f, 56f)
                lineToRelative(-180f, -180f)
                quadToRelative(34f, -11f, 68.5f, -15.5f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(94f, 0f, 177.5f, 33.5f)
                reflectiveQuadToRelative(148f, 93f)
                quadTo(870f, 186f, 911f, 266.5f)
                reflectiveQuadTo(960f, 440f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Crop_rotate!!
    }

private var _Crop_rotate: ImageVector? = null

