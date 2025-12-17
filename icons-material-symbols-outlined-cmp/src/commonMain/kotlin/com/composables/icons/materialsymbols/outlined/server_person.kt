package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Server_person: ImageVector
    get() {
        if (_Server_person != null) return _Server_person!!
        
        _Server_person = ImageVector.Builder(
            name = "server_person",
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
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(600f)
                lineToRelative(-40f, -80f)
                horizontalLineTo(400f)
                lineToRelative(-40f, 80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(70f)
                lineToRelative(40f, -80f)
                horizontalLineToRelative(260f)
                lineToRelative(40f, 80f)
                horizontalLineToRelative(70f)
                verticalLineToRelative(-640f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(80f, -200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -52f, -50f, -75f)
                reflectiveQuadToRelative(-110f, -23f)
                quadToRelative(-60f, 0f, -110f, 23f)
                reflectiveQuadToRelative(-50f, 75f)
                verticalLineToRelative(22f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 360f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveToRelative(0f, 40f)
                close()
            }
        }.build()
        
        return _Server_person!!
    }

private var _Server_person: ImageVector? = null

