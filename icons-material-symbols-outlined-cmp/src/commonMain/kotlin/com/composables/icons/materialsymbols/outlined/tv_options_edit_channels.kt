package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Tv_options_edit_channels: ImageVector
    get() {
        if (_Tv_options_edit_channels != null) return _Tv_options_edit_channels!!
        
        _Tv_options_edit_channels = ImageVector.Builder(
            name = "tv_options_edit_channels",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(160f, 320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(398f, 480f)
                lineTo(468f, 630f)
                lineToRelative(57f, -57f)
                lineToRelative(113f, 113f)
                lineToRelative(226f, -226f)
                lineToRelative(56f, 58f)
                lineToRelative(-282f, 282f)
                close()
            }
        }.build()
        
        return _Tv_options_edit_channels!!
    }

private var _Tv_options_edit_channels: ImageVector? = null

