package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Cameraswitch: ImageVector
    get() {
        if (_Cameraswitch != null) return _Cameraswitch!!
        
        _Cameraswitch = ImageVector.Builder(
            name = "cameraswitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 280f)
                horizontalLineToRelative(40f)
                lineToRelative(40f, -40f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, 40f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 360f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 680f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-240f)
                horizontalLineTo(320f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(160f, -40f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 400f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveTo(342f, 20f)
                quadToRelative(34f, -11f, 68.5f, -15.5f)
                reflectiveQuadTo(480f, 0f)
                quadToRelative(94f, 0f, 177.5f, 33.5f)
                reflectiveQuadToRelative(148f, 93f)
                quadTo(870f, 186f, 911f, 266.5f)
                reflectiveQuadTo(960f, 440f)
                horizontalLineToRelative(-80f)
                quadToRelative(-7f, -72f, -38f, -134.5f)
                reflectiveQuadToRelative(-79.5f, -110f)
                quadTo(714f, 148f, 651f, 118f)
                reflectiveQuadToRelative(-135f, -36f)
                lineToRelative(62f, 62f)
                lineToRelative(-56f, 56f)
                lineToRelative(-180f, -180f)
                close()
                moveTo(618f, 940f)
                quadTo(584f, 951f, 549.5f, 955.5f)
                reflectiveQuadTo(480f, 960f)
                quadToRelative(-94f, 0f, -177.5f, -33.5f)
                reflectiveQuadToRelative(-148f, -93f)
                quadTo(90f, 774f, 49f, 693.5f)
                reflectiveQuadTo(0f, 520f)
                horizontalLineToRelative(80f)
                quadToRelative(8f, 72f, 38.5f, 134.5f)
                reflectiveQuadToRelative(79f, 110f)
                quadTo(246f, 812f, 309f, 842f)
                reflectiveQuadToRelative(135f, 36f)
                lineToRelative(-62f, -62f)
                lineToRelative(56f, -56f)
                lineTo(618f, 940f)
                close()
                moveTo(480f, 480f)
                close()
            }
        }.build()
        
        return _Cameraswitch!!
    }

private var _Cameraswitch: ImageVector? = null

