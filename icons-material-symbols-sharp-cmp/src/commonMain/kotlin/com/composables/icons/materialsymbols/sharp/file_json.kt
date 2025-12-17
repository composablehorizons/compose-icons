package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.File_json: ImageVector
    get() {
        if (_File_json != null) return _File_json!!
        
        _File_json = ImageVector.Builder(
            name = "file_json",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 600f)
                horizontalLineToRelative(90f)
                lineToRelative(30f, -30f)
                verticalLineToRelative(-210f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(190f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(70f)
                lineToRelative(30f, 30f)
                close()
                moveToRelative(177f, 0f)
                horizontalLineToRelative(80f)
                lineToRelative(30f, -30f)
                verticalLineToRelative(-80f)
                lineToRelative(-30f, -30f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-50f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-40f)
                lineToRelative(-30f, -30f)
                horizontalLineToRelative(-80f)
                lineToRelative(-30f, 30f)
                verticalLineToRelative(80f)
                lineToRelative(30f, 30f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(50f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(40f)
                lineToRelative(30f, 30f)
                close()
                moveToRelative(186f, -60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                close()
                moveToRelative(-20f, 60f)
                horizontalLineToRelative(80f)
                lineToRelative(30f, -30f)
                verticalLineToRelative(-180f)
                lineToRelative(-30f, -30f)
                horizontalLineToRelative(-80f)
                lineToRelative(-30f, 30f)
                verticalLineToRelative(180f)
                lineToRelative(30f, 30f)
                close()
                moveToRelative(137f, 0f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-105f)
                lineToRelative(40f, 105f)
                horizontalLineToRelative(50f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(105f)
                lineToRelative(-40f, -105f)
                horizontalLineToRelative(-50f)
                verticalLineToRelative(240f)
                close()
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(640f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-480f)
                horizontalLineTo(120f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _File_json!!
    }

private var _File_json: ImageVector? = null

