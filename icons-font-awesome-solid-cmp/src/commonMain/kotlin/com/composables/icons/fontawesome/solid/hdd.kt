package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Hdd: ImageVector
    get() {
        if (_Hdd != null) return _Hdd!!
        
        _Hdd = ImageVector.Builder(
            name = "hdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(576f, 304f)
                verticalLineToRelative(96f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                close()
                moveToRelative(-48f, -80f)
                arcToRelative(79.557f, 79.557f, 0f, false, true, 30.777f, 6.165f)
                lineTo(462.25f, 85.374f)
                arcTo(48.003f, 48.003f, 0f, false, false, 422.311f, 64f)
                horizontalLineTo(153.689f)
                arcToRelative(48f, 48f, 0f, false, false, -39.938f, 21.374f)
                lineTo(17.223f, 230.165f)
                arcTo(79.557f, 79.557f, 0f, false, true, 48f, 224f)
                horizontalLineToRelative(480f)
                close()
                moveToRelative(-48f, 96f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
                moveToRelative(-96f, 0f)
                curveToRelative(-17.673f, 0f, -32f, 14.327f, -32f, 32f)
                reflectiveCurveToRelative(14.327f, 32f, 32f, 32f)
                reflectiveCurveToRelative(32f, -14.327f, 32f, -32f)
                reflectiveCurveToRelative(-14.327f, -32f, -32f, -32f)
                close()
            }
        }.build()
        
        return _Hdd!!
    }

private var _Hdd: ImageVector? = null

