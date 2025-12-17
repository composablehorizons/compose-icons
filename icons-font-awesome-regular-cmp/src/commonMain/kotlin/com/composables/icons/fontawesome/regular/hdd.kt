package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Hdd: ImageVector
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
                moveTo(567.403f, 235.642f)
                lineTo(462.323f, 84.589f)
                arcTo(48f, 48f, 0f, false, false, 422.919f, 64f)
                horizontalLineTo(153.081f)
                arcToRelative(48f, 48f, 0f, false, false, -39.404f, 20.589f)
                lineTo(8.597f, 235.642f)
                arcTo(48.001f, 48.001f, 0f, false, false, 0f, 263.054f)
                verticalLineTo(400f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(263.054f)
                curveToRelative(0f, -9.801f, -3f, -19.366f, -8.597f, -27.412f)
                close()
                moveTo(153.081f, 112f)
                horizontalLineToRelative(269.838f)
                lineToRelative(77.913f, 112f)
                horizontalLineTo(75.168f)
                lineToRelative(77.913f, -112f)
                close()
                moveTo(528f, 400f)
                horizontalLineTo(48f)
                verticalLineTo(272f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(128f)
                close()
                moveToRelative(-32f, -64f)
                curveToRelative(0f, 17.673f, -14.327f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.327f, -32f, -32f)
                reflectiveCurveToRelative(14.327f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.327f, 32f, 32f)
                close()
                moveToRelative(-96f, 0f)
                curveToRelative(0f, 17.673f, -14.327f, 32f, -32f, 32f)
                reflectiveCurveToRelative(-32f, -14.327f, -32f, -32f)
                reflectiveCurveToRelative(14.327f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.327f, 32f, 32f)
                close()
            }
        }.build()
        
        return _Hdd!!
    }

private var _Hdd: ImageVector? = null

