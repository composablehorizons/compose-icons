package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Sync_saved_locally: ImageVector
    get() {
        if (_Sync_saved_locally != null) return _Sync_saved_locally!!
        
        _Sync_saved_locally = ImageVector.Builder(
            name = "sync_saved_locally",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(437f, 562f)
                lineToRelative(227f, -226f)
                lineToRelative(-57f, -57f)
                lineToRelative(-170f, 170f)
                lineToRelative(-85f, -85f)
                lineToRelative(-56f, 56f)
                lineToRelative(141f, 142f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(40f, -120f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(600f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-440f)
                horizontalLineTo(160f)
                verticalLineToRelative(440f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-440f)
                verticalLineToRelative(440f)
                close()
            }
        }.build()
        
        return _Sync_saved_locally!!
    }

private var _Sync_saved_locally: ImageVector? = null

