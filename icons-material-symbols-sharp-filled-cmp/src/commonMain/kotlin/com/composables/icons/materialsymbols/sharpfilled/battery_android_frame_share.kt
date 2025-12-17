package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Battery_android_frame_share: ImageVector
    get() {
        if (_Battery_android_frame_share != null) return _Battery_android_frame_share!!
        
        _Battery_android_frame_share = ImageVector.Builder(
            name = "battery_android_frame_share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 720f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(687f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(120f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(480f, -80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(247f)
                lineToRelative(-63f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-57f, -57f)
                lineToRelative(64f, -63f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-80f, -40f)
                horizontalLineTo(160f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(447f)
                horizontalLineToRelative(-167f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Battery_android_frame_share!!
    }

private var _Battery_android_frame_share: ImageVector? = null

