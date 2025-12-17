package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.FaceSmile: ImageVector
    get() {
        if (_FaceSmile != null) return _FaceSmile!!
        
        _FaceSmile = ImageVector.Builder(
            name = "face-smile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 8f)
                arcTo(7f, 7f, 0f, true, true, 1f, 8f)
                arcToRelative(7f, 7f, 0f, false, true, 14f, 0f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0.552f, 0f, 1f, -0.672f, 1f, -1.5f)
                reflectiveCurveTo(6.552f, 5f, 6f, 5f)
                reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
                reflectiveCurveTo(5.448f, 8f, 6f, 8f)
                close()
                moveToRelative(5f, -1.5f)
                curveToRelative(0f, 0.828f, -0.448f, 1.5f, -1f, 1.5f)
                reflectiveCurveToRelative(-1f, -0.672f, -1f, -1.5f)
                reflectiveCurveTo(9.448f, 5f, 10f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                close()
                moveToRelative(0.005f, 4.245f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                arcToRelative(2.75f, 2.75f, 0f, false, true, -3.89f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                arcToRelative(4.25f, 4.25f, 0f, false, false, 6.01f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _FaceSmile!!
    }

private var _FaceSmile: ImageVector? = null

