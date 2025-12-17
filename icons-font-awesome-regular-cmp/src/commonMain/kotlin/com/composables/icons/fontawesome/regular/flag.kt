package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Flag: ImageVector
    get() {
        if (_Flag != null) return _Flag!!
        
        _Flag = ImageVector.Builder(
            name = "flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(336.174f, 80f)
                curveToRelative(-49.132f, 0f, -93.305f, -32f, -161.913f, -32f)
                curveToRelative(-31.301f, 0f, -58.303f, 6.482f, -80.721f, 15.168f)
                arcToRelative(48.04f, 48.04f, 0f, false, false, 2.142f, -20.727f)
                curveTo(93.067f, 19.575f, 74.167f, 1.594f, 51.201f, 0.104f)
                curveTo(23.242f, -1.71f, 0f, 20.431f, 0f, 48f)
                curveToRelative(0f, 17.764f, 9.657f, 33.262f, 24f, 41.562f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.837f, 7.163f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineToRelative(-83.443f)
                curveTo(109.869f, 395.28f, 143.259f, 384f, 199.826f, 384f)
                curveToRelative(49.132f, 0f, 93.305f, 32f, 161.913f, 32f)
                curveToRelative(58.479f, 0f, 101.972f, -22.617f, 128.548f, -39.981f)
                curveTo(503.846f, 367.161f, 512f, 352.051f, 512f, 335.855f)
                verticalLineTo(95.937f)
                curveToRelative(0f, -34.459f, -35.264f, -57.768f, -66.904f, -44.117f)
                curveTo(409.193f, 67.309f, 371.641f, 80f, 336.174f, 80f)
                close()
                moveTo(464f, 336f)
                curveToRelative(-21.783f, 15.412f, -60.824f, 32f, -102.261f, 32f)
                curveToRelative(-59.945f, 0f, -102.002f, -32f, -161.913f, -32f)
                curveToRelative(-43.361f, 0f, -96.379f, 9.403f, -127.826f, 24f)
                verticalLineTo(128f)
                curveToRelative(21.784f, -15.412f, 60.824f, -32f, 102.261f, -32f)
                curveToRelative(59.945f, 0f, 102.002f, 32f, 161.913f, 32f)
                curveToRelative(43.271f, 0f, 96.32f, -17.366f, 127.826f, -32f)
                verticalLineToRelative(240f)
                close()
            }
        }.build()
        
        return _Flag!!
    }

private var _Flag: ImageVector? = null

