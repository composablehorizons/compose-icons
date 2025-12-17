package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.LiraSign: ImageVector
    get() {
        if (_LiraSign != null) return _LiraSign!!
        
        _LiraSign = ImageVector.Builder(
            name = "lira-sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(371.994f, 256f)
                horizontalLineToRelative(-48.019f)
                curveTo(317.64f, 256f, 312f, 260.912f, 312f, 267.246f)
                curveTo(312f, 368f, 230.179f, 416f, 144f, 416f)
                verticalLineTo(256.781f)
                lineToRelative(134.603f, -29.912f)
                arcTo(12f, 12f, 0f, false, false, 288f, 215.155f)
                verticalLineToRelative(-40.976f)
                curveToRelative(0f, -7.677f, -7.109f, -13.38f, -14.603f, -11.714f)
                lineTo(144f, 191.219f)
                verticalLineTo(160.78f)
                lineToRelative(134.603f, -29.912f)
                arcTo(12f, 12f, 0f, false, false, 288f, 119.154f)
                verticalLineTo(78.179f)
                curveToRelative(0f, -7.677f, -7.109f, -13.38f, -14.603f, -11.714f)
                lineTo(144f, 95.219f)
                verticalLineTo(44f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(76f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(68.997f)
                lineTo(9.397f, 125.131f)
                arcTo(12f, 12f, 0f, false, false, 0f, 136.845f)
                verticalLineToRelative(40.976f)
                curveToRelative(0f, 7.677f, 7.109f, 13.38f, 14.603f, 11.714f)
                lineTo(64f, 178.558f)
                verticalLineToRelative(30.439f)
                lineTo(9.397f, 221.131f)
                arcTo(12f, 12f, 0f, false, false, 0f, 232.845f)
                verticalLineToRelative(40.976f)
                curveToRelative(0f, 7.677f, 7.109f, 13.38f, 14.603f, 11.714f)
                lineTo(64f, 274.558f)
                verticalLineTo(468f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(79.583f)
                curveToRelative(134.091f, 0f, 223.255f, -77.834f, 228.408f, -211.592f)
                curveToRelative(0.261f, -6.782f, -5.211f, -12.408f, -11.997f, -12.408f)
                close()
            }
        }.build()
        
        return _LiraSign!!
    }

private var _LiraSign: ImageVector? = null

